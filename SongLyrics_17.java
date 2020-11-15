package OOP;

public class SongLyrics_17 {
	private String intro;
	private String verse;
	private String pre_chorus;
	private String chorus;
	private String bridge;
	
	public SongLyrics_17() {
		setIntro("");
		setVerse("");
		setPre_chorus("");
		setChorus("");
		setBridge("");
	}
	
	public SongLyrics_17(String a,String b, String c, String d, String e) {
		this.intro = a;
		this.verse = b;
		this.pre_chorus = c;
		this.chorus = d;
		this.bridge = e;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getVerse() {
		return verse;
	}

	public void setVerse(String verse) {
		this.verse = verse;
	}

	public String getPre_chorus() {
		return pre_chorus;
	}

	public void setPre_chorus(String pre_chorus) {
		this.pre_chorus = pre_chorus;
	}

	public String getChorus() {
		return chorus;
	}

	public void setChorus(String chorus) {
		this.chorus = chorus;
	}

	public String getBridge() {
		return bridge;
	}

	public void setBridge(String bridge) {
		this.bridge = bridge;
	}
}
