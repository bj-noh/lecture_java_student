package assignment08_01;

import java.util.Random;

public class MusicSelector {
	
	public String[][] selector(String[][] music, String artist) {
		
		String[][] result = new String[10][3];
	    String artistCluster = "";
	    int count = 0;

	    // Find the cluster of the input artist
	    for (int i = 0; i < music.length; i++) {
	        if (music[i][0].equals(artist)) {
	            artistCluster = music[i][2];
	            break;
	        }
	    }

	    // Select 10 songs with the same cluster as the input artist
	    for (int i = 0; i < music.length && count < 10; i++) {
	        if (music[i][0].equals(artist) || !music[i][2].equals(artistCluster)) {
	            continue;
	        }
	        boolean hasSameArtist = false;
	        for (int j = 0; j < count; j++) {
	            if (result[j][0].equals(music[i][0])) {
	                hasSameArtist = true;
	                break;
	            }
	        }
	        if (hasSameArtist) {
	            continue;
	        }
	        result[count][0] = music[i][0];
	        result[count][1] = music[i][1];
	        result[count][2] = music[i][2];
	        count++;
	    }

	    return result;
	}

}
