/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.videoclub;

/**
 *
 * @author Aleexis
 */
public class ClientVideoClubService implements IVideoClubService {

    private IVideoClubService remoteVideoClubService;

    public ClientVideoClubService(IVideoClubService remoteVideoClubService) {
        if (remoteVideoClubService == null) {
            throw new IllegalArgumentException(
                    "'remoteVideoClubService' must not be null");

        }
    }

    @Override
    public IVideo getVideo(int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}