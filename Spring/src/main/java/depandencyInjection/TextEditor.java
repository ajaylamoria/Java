package depandencyInjection;

public class TextEditor {

	private SpellChecker spellChecker;
	private LanguageChecker langChecker;

	public TextEditor(){
		System.out.println("Inside Text Editor constructor");
	}
	  /* public TextEditor(SpellChecker spellChecker ,LanguageChecker langChecker) {
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	      this.langChecker = langChecker;
	   }*/
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	   
	   public void langCheck(){
		   langChecker.checkLanguage();
	   }
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		System.out.println("Inside SpellChecker Setter");
		this.spellChecker = spellChecker;
	}
	   
	   
}
