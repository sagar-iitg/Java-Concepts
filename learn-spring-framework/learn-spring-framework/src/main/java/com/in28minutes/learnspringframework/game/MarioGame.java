package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {

	@Override
	public void up() {
		System.out.println("Jump");
	}

	@Override
	public void down() {
		System.out.println("go into the hole");
	}

	@Override
	public void left() {
		System.out.println("stop");
	}

	@Override
	public void right() {
		System.out.println("go faster");
	}

}
