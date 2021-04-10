/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.videoclub;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Aleexis
 */
public class ClientVideoClubServiceTest extends TestCase {

    private IVideoClubService remoteVideoClubServiceMock;
    private IVideo Video28Mock;

    protected void setUp() throws Exception {
        super.setUp();
        Video28Mock = EasyMock.createMock(IVideo.class);
        remoteVideoClubServiceMock
                = EasyMock.createMock(IVideoClubService.class);
    }

    public void testClientVideoClubService() {
        try {
            new ClientVideoClubService(null);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // expected 
        }
        new ClientVideoClubService(remoteVideoClubServiceMock);
    }

    /**
     * Test of getVideo of class ClientVideoClubService.
     */
    public void testGetVideo() throws Exception {
        EasyMock.expect(remoteVideoClubServiceMock.getVideo(28))
                .andReturn(Video28Mock);
        EasyMock.replay(remoteVideoClubServiceMock);
        IVideoClubService clientVideoClubService
                = new ClientVideoClubService(remoteVideoClubServiceMock);
        IVideo result = clientVideoClubService.getVideo(28);
        assertEquals(Video28Mock, result);
        EasyMock.verify(remoteVideoClubServiceMock);

    }

}
