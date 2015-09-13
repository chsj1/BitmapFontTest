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
	TextureRegion bgRegion;//����ͼƬ
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		/**
		 * BitmapFont�ĳ�ʼ����
		 * 3�������ֱ�Ϊ:fontFile(�����ļ�)��imageFile(����Ӧ��png�ļ�)���Ƿ�ת
		 */
		font = new BitmapFont(Gdx.files.internal("data/tt1.fnt"), Gdx.files.internal("data/tt1.png"), false);
//		font.setColor(0.5f, 0.4f, 0.6f, 1);//������ɫ
		font.setColor(Color.BLACK);//����������ɫ�����������,Ĭ�����Ǹ��ļ��������ɫ
		font.setScale(1f);//�������������С
		
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
		 * ������滭����
		 * 4�������ֱ�Ϊ: ��ʹ�õ�SpriteBathc����Ҫ���Ƶ�����(Ӣ�Ķ�����,���ı������Ǹ������ļ����еĲſ���,��ʾλ�õ��������(x,y))
		 */
		font.draw(batch, "Ŭ���ܶ�,��������", 30, 300);
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