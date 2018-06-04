package selectCourse.jz2.action;

import selectCourse.jz2.pojo.Sw;
import selectCourse.jz2.service.ISWService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("swAction")
@Scope("prototype")
public class SWAction extends ActionSupport implements ModelDriven<Sw> {
    private Sw sw;

    public Sw getSw() {
        return sw;
    }

    public void setSw(Sw sw) {
        this.sw = sw;
    }

    public ISWService getSwService() {
        return swService;
    }

    public void setSwService(ISWService swService) {
        this.swService = swService;
    }

    @Autowired
    private ISWService swService;

    public Sw getModel() {
        return null;
    }

    public String list() {
        List<Sw> sws = swService.list();
        ActionContext.getContext().put("sw", sws);
        return SUCCESS;
    }

    public String update() {
        swService.update();
        return "redirect";
    }
}
