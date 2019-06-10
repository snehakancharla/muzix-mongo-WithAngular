package com.stackroute.muzix.repository;

import com.stackroute.muzix.domain.Track;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
//@DataMongoTest
//@DataJpaTest
public class TrackRepositoryTest {
    @Autowired
    TrackRepository trackRepository;
    Track track;

    @Before
    public void setUp()
    {
        track= new Track();
        track.setId(10);
        track.setName("hema");
        track.setComment("nice girl");

    }

    @After
    public void tearDown(){

        trackRepository.deleteAll();
    }


    @Test
    public void testSaveTrack(){

        trackRepository.save(track);
        Track fetchUser = trackRepository.findById(track.getId()).get();
        Assert.assertEquals(10,fetchUser.getId());

    }

    @Test
    public void testSaveUserFailure(){
        Track testUser = new Track(34,"sai","gud");
        trackRepository.save(track);
        Track fetchUser = trackRepository.findById(track.getId()).get();
        Assert.assertNotSame(testUser,track);
    }

    @Test
    public void testGetAllTracks(){
        Track u = new Track(10,"hema","nice girl");
        Track u1 = new Track(34,"sai","gud");
        trackRepository.save(u);
        trackRepository.save(u1);

        List<Track> list = trackRepository.findAll();
        Assert.assertEquals("sai",list.get(1).getName());
    }
}


