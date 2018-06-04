$(function(){
  var tab = 'account_number';
  
  // 修改账号，隐藏hide标签
  $('#num').keyup(function(event) {
    $('#num+.tel-warn').addClass('hide');
    checkBtn();
  });
  
  // 修改密码，隐藏hide标签
  $('#pass').keyup(function(event) {
    $('#pass+.tel-warn').addClass('hide');
    checkBtn();
  });
  
  // 登录按钮是否可点击
  function checkBtn()
  {
    var inp = $.trim($('#num').val());
    var pass = $.trim($('#pass').val());
    if (inp != '' && pass != '') {
      $(".log-btn").attr("disabled",false);
      $(".log-btn").removeClass("off");
    } else {
      $(".log-btn").addClass("off");
      $(".log-btn").attr("disabled",true);
    }
    
  }
  
  function checkAccount(username){
    if (username == '') {
      $('.num-err').removeClass('hide').find("em").text('请输入账户');
      return false;
    } else {
      $('.num-err').addClass('hide');
      return true;
    }
  }
  
  function checkPass(pass){
    if (pass == '') {
      $('.pass-err').removeClass('hide').text('请输入密码');
      return false;
    } else {
      $('.pass-err').addClass('hide');
      return true;
    }
  }
  
  // 登录点击事件
  function sendBtn(){
    $(".log-btn").click(function(){
      // var type = 'phone';
      var inp = $.trim($('#num').val());
      var pass = $.md5($.trim($('#pass').val()));
      if (checkAccount(inp) && checkPass(pass)) {
        var ldata = {userinp:inp,password:pass};
        $.ajax({
          url: '/dologin',
          type: 'post',
          dataType: 'json',
          async: true,
          data: ldata,
          success:function(data){
            if (data.code == '0') {
              // globalTip({'msg':'登录成功!','setTime':3,'jump':true,'URL':'http://www.ui.cn'});
              globalTip(data.msg);
            } else if(data.code == '2') {
              $(".log-btn").off('click').addClass("off");
              $('.pass-err').removeClass('hide').find('em').text(data.msg);
              $('.pass-err').find('i').attr('class', 'icon-warn').css("color","#d9585b");
              return false;
            } else if(data.code == '3') {
              $(".log-btn").off('click').addClass("off");
              return false;
            } else if(data.code == '1'){
              $(".log-btn").off('click').addClass("off");
              $('.num-err').removeClass('hide').find('em').text(data.msg);
              $('.num-err').find('i').attr('class', 'icon-warn').css("color","#d9585b");
              return false;
            }
          },
          error:function(){
          
          }
        });
      } else {
        return false;
      }
    });
    
  }
  
  // 登录的回车事件
  $(window).keydown(function(event) {
    if (event.keyCode == 13) {
      $('.log-btn').trigger('click');
    }
  });
  
  
});