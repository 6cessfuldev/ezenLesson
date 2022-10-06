package wordBook;

public class Word implements Comparable<Word>{
	private String word;
	private String mean;
	
	public Word () {}
	
	public Word (String word) {
		this.word = word;
	}
	
	public Word (String word, String mean) {
		this.word = word;
		this.mean = mean;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	@Override
	public boolean equals(Object obj) {
		Word other = (Word)obj;		
		if(other.getWord().equals(this.word)) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int compareTo(Word o) {
		
		return this.word.compareTo(o.getWord());
	}
}
