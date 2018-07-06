package jp.techacademy.ryouga.yoshida.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class GameObject extends Sprite {
    //x,y方向の速度を保持する
    public final Vector2 velocity;

    public GameObject(Texture texture,int srcX,int srcY,int srcWidth,int srcHeight){
        super(texture,srcX,srcY,srcWidth,srcHeight);

        velocity = new Vector2();
    }
}