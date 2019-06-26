// Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _07_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/*
		 * 1. Ask the user which animal they want, then play the sound of that animal.
		 */
		String e= "";
		e= JOptionPane.showInputDialog ("What animal: (1)llama, (2)me-gusta, (3)cat, (4)cow, (5)duck, (6)dog");
		if (e.equals("1")) {
			playLlama();
		}
		if (e.equals("2")) {
			playMegusta();
		}
		if (e.equals("3")) {
			playCat();
		}
		
	if (e.equals("4")) {
		playMoo();
	
	}
	if (e.equals("5")) {
		playQuack();
	}
	
    if (e.equals("6")) {
	playWoof();
	}
	}
/* 2. Make it so that the user can keep entering new animals. */
	void playLlama() {
		playNoise(llamaFile);
	}
	
	void playMegusta(){
		playNoise(MegustaFile);
	}
	
	void playCat() {
		playNoise(meowFile);
	}
	
	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";
	String MegustaFile = "me-gusta.wav";
	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	
	}
}

