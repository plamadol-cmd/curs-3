package teachers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher{

    FrameworkKnowledge frameworkKnowledge;
    @Autowired
    private ITeachingService tipsAndTricksService;

//    public WebDevTeacher(FrameworkKnowledge frameworkKnowledge) {
//        this.frameworkKnowledge = frameworkKnowledge;
//    }
//
//    @Autowired
//    public WebDevTeacher(TipsAndTricksService tipsAndTricksService,
//                         FrameworkKnowledge frameworkKnowledge) {
//        this.tipsAndTricksService = tipsAndTricksService;
//        this.frameworkKnowledge = frameworkKnowledge;
//    }

    @Autowired
    public void setFrameworkKnowledge(FrameworkKnowledge frameworkKnowledge) {
        this.frameworkKnowledge = frameworkKnowledge;
    }

    @Autowired(required = false)
    public void setTipsAndTricksService(TipsAndTricksService tipsAndTricksService) {
        this.tipsAndTricksService = tipsAndTricksService;
    }

    public void printKnowledge() {
        System.out.println(tipsAndTricksService.teachSomething());
    }

}
