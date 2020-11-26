package OOP;

import java.sql.Date;
import java.util.ArrayList;

public class RecordShopTest_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> metalInstruments = new ArrayList <String>();
		ArrayList <Song_17> SBG_songs = new ArrayList <Song_17>();
		ArrayList <Album_17> deathAlbums = new ArrayList <Album_17> ();
		ArrayList <Copy_17> myCDs = new ArrayList <Copy_17>();
		
		metalInstruments.add("Electric guitar");
		metalInstruments.add("Bass");
		metalInstruments.add("Drums");
		metalInstruments.add("Vocals");
		
		Artist_17 death = new Artist_17();
		death.setName("Death");
		death.setActiveFrom(1984);

		
		SongLyrics_17 infernalDeathLyr = new SongLyrics_17("Die, Die, Die", ""," Piling the bodies."
						+ " Burn them in the night. Skin grows black and withered"
						+ " Decayed smell will rise ", " Existence fading "
						+ " Into ashes"
						+ " Burn those bodies "
						+ "To Infernal death", " ");

		
		Date SBG_release = new Date (548899200000L);
		Album_17 screamBloodyGore = new Album_17(death, SBG_release, "Scream Bloody Gore", null, 37.51, SBG_songs );
		deathAlbums.add(screamBloodyGore);
		
		Song_17 infernalDeath = new Song_17(2.53, "Infernal Death", infernalDeathLyr);
		SBG_songs.add(infernalDeath);
		
		Genre_17 deathMetal = new Genre_17("Death metal", death, metalInstruments, screamBloodyGore);
		screamBloodyGore.setGenre(deathMetal);
		
		death.setGenre(deathMetal);
		death.setAlbums(deathAlbums);
		death.setActiveTo(2001);
		
		//lyrics 
		System.out.println(infernalDeathLyr.getIntro() + " " + ((death.getGenre()).getFirstAlbum().getSongs()).get(0).getLyrics().getChorus());
		
		//song
		System.out.println(infernalDeath.getLength() + " " + infernalDeath.getTitle());
		
		//release date 
		System.out.println(SBG_release);
		
		//album
		System.out.println(screamBloodyGore.getLength() + ", " + screamBloodyGore.getName() 
				+ ","+ (screamBloodyGore.getArtist()).getName() + ", " + (screamBloodyGore.getGenre()).getName());
		
		//band
		System.out.println(death.getName() + " " + death.getActiveFrom() + "-" + death.getActiveTo() 
			+ " " + death.getGenre().getName() + ", " + death.getAlbums().get(0).getName());
		
		System.out.print("\n\n");
		
		Copy_17 copySBG = new Copy_17("CD", "SWD83799LW", 16.33, screamBloodyGore);
		myCDs.add(copySBG);
		
		RecordShop_17 shop = new RecordShop_17("My record shop", null, myCDs, null, "Some Street no. 7774");
		
		//copy
		System.out.println(copySBG.getFormat() + " " + copySBG.getISBN() + 
				" " + copySBG.getAlbum().getName() + " " + copySBG.getPrice());
		
		//store
		System.out.println(shop.getName() + " " + shop.getAddress() +
				" " + shop.getCDs().get(0).getAlbum().getName());
		
		System.out.print("\n\n");
		//connections
		System.out.println((death.getGenre()).getFirstAlbum().getLength() 
				+ " " +  (death.getGenre()).getFirstArtist().getName());
		
		//ultimate test
		System.out.println(shop.getCDs().get(0).getAlbum().getArtist().getGenre().getCommonInstruments());
	}
	//

}
