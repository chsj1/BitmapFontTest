package com.example.hellolibgdx;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class MyGame implements ApplicationListener {
	SpriteBatch batch;
	BitmapFont font;
	
	TextureAtlas atlas;
	TextureRegion bgRegion;//背景图片
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		/**
		 * BitmapFont的初始化。
		 * 3个参数分别为:fontFile(字体文件)、imageFile(所对应的png文件)、是否翻转
		 */
		font = new BitmapFont(Gdx.files.internal("data/tt1.fnt"), Gdx.files.internal("data/tt1.png"), false);
//		font.setColor(0.5f, 0.4f, 0.6f, 1);//设置颜色
		font.setColor(Color.BLACK);//设置字体颜色。如果不处理,默认是那个文件里面的颜色
		font.setScale(1f);//设置字体比例大小
		
		atlas = new TextureAtlas(Gdx.files.internal("data/loading.atlas"));
		bgRegion = atlas.findRegion("bg");
	}
	@Override
	public void dispose() {
	}
	@Override
	public void pause() {
	}
	@Override
	public void render() {
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		batch.begin();
		
		batch.draw(bgRegion, 0, 0, 480, 800);
		/**
		 * 把字体绘画出来
		 * 4个参数分别为: 所使用的SpriteBathc、所要绘制的字体(英文都可以,中文必须是那个字体文件中有的才可以,显示位置的起点坐标(x,y))
		 */
		font.draw(batch, "努力奋斗,快乐生活", 30, 300);
		font.draw(batch, "hello libGDX", 100, 200);
		
		batch.end();
	}
	@Override
	public void resize(int arg0, int arg1) {
	}
	@Override
	public void resume() {
	}
}