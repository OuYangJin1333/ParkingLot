package cn.park.config;

import cn.park.Repository.EsvipRepository;
import cn.park.Repository.PartRepository;
import cn.park.service.PartService;
import cn.park.service.PilvipuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyCommandlineRunner implements CommandLineRunner {

    @Autowired
    PartRepository partRepository;
    @Autowired
    PartService partService;
    @Autowired
    EsvipRepository esvipRepository;
    @Autowired
    PilvipuserService pilvipuserService;


    public void run(String... args) throws Exception {
       /* partService.deleteAll();
        partService.importAll();*/
        pilvipuserService.Allvip();

    }

}
