//package com.stackroute.muzix.seeder;
//
//import com.stackroute.muzix.domain.Track;
//import com.stackroute.muzix.service.TrackService;
//import com.stackroute.muzix.service.TrackService;
//import com.stackroute.muzix.domain.Track;
//import com.stackroute.muzix.exception.TrackAlreadyExistsException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.context.event.ContextRefreshedEvent;
//import org.springframework.stereotype.Component;
//@Component
//@PropertySource("classpath:application.properties")
//public class SeedData implements ApplicationListener<ContextRefreshedEvent>, CommandLineRunner {
//
//    @Autowired
//    TrackService trackService;
//
//    public SeedData(TrackService trackService) {
//        this.trackService = trackService;
//    }
//
//    public TrackService getTrackService() {
//        return trackService;
//    }
//
//    public void setTrackService(TrackService trackService) {
//        this.trackService = trackService;
//    }
//
//    @Value("${id1}")
//    int id1;
//
//    @Value("${name1}")
//    String name1;
//
//    @Value("${comment1}")
//    String comment1;
//
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        Track track = new Track(id1, name1, comment1);
//        try {
//                trackService.saveTrack(track);
//        } catch (TrackAlreadyExistsException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Value("${id2}")
//    int id2;
//    @Value("${name2}")
//    String name2;
//
//    @Value("${comment2}")
//    String comment2;
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        Track track = new Track(id2, name2, comment2);
//        try {
//            trackService.saveTrack(track);
//        } catch (TrackAlreadyExistsException e) {
//            e.printStackTrace();
//        }
//    }
//}