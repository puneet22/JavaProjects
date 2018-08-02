package com.deloitte.pojo;

public class TextEditor {
	 private SpellChecker spellChecker;
	 private String name;
	 
	 public TextEditor() {
	  System.out.println("TextEditor default constructor");
	 }
	 
	 public TextEditor(SpellChecker spellChecker) {
	  System.out.println("inside textEditor constructor");
	  this.spellChecker= spellChecker;
	 }

	 public void spellCheck() {
	  spellChecker.checkSpelling();
	 }

	 public SpellChecker getSpellChecker() {
	  return spellChecker;
	 }

	 public void setSpellChecker(SpellChecker spellChecker) {
	  this.spellChecker = spellChecker;
	 }

	 public void getName() {
	  System.out.println("name:"+ name);
	 }

	 public void setName(String name) {
	  this.name = name;
	 }
	 
	}
