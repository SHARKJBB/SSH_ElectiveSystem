<%--
  Created by IntelliJ IDEA.
  User: sharkj
  Date: 2018/5/29
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <link rel="bookmark" type="image/x-icon" href="../../img/nlogo.png""/>
    <link rel="shortcut icon" href="../../img/nlogo.png">
    <link rel="icon" href="../../img/nlogo.png">
    <link href="../../css/404.css" rel="stylesheet" type="text/css" />
    <script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
    <script type="text/javascript">
        $(function() {
            var h = $(window).height();
            $('body').height(h);
            $('.mianBox').height(h);
            centerWindow(".tipInfo");
        });

        //2.将盒子方法放入这个方，方便法统一调用
        function centerWindow(a) {
            center(a);
            //自适应窗口
            $(window).bind('scroll resize',
                function() {
                    center(a);
                });
        }

        //1.居中方法，传入需要剧中的标签
        function center(a) {
            var wWidth = $(window).width();
            var wHeight = $(window).height();
            var boxWidth = $(a).width();
            var boxHeight = $(a).height();
            var scrollTop = $(window).scrollTop();
            var scrollLeft = $(window).scrollLeft();
            var top = scrollTop + (wHeight - boxHeight) / 2;
            var left = scrollLeft + (wWidth - boxWidth) / 2;
            $(a).css({
                "top": top,
                "left": left
            });
        }
    </script>
</head>
<body>
<div class="mianBox">
    <img src="../../img/yun0.png" alt="" class="yun yun0" />
    <img src="../../img/yun1.png" alt="" class="yun yun1" />
    <img src="../../img/yun2.png" alt="" class="yun yun2" />
    <img src="../../img/bird.png" alt="" class="bird" />
    <img src="../../img/san.png" alt="" class="san" />
    <div class="tipInfo">
        <div class="in">
            <div class="textThis">
                <h2><s:property value="#error" /></h2>
                <p><span>页面自动<a id="href" href="../../login.jsp">跳转</a></span><span>等待<b id="wait">6</b>秒</span></p>
                <script type="text/javascript">                            (function() {
                    var wait = document.getElementById('wait'), href = document.getElementById('href').href;
                    var interval = setInterval(function() {
                        var time = --wait.innerHTML;
                        if (time <= 0) {
                            location.href = href;
                            clearInterval(interval);
                        }
                        ;
                    }, 1000);
                })();
                </script>
            </div>
        </div>
    </div>
</div>
</body>
</html>
