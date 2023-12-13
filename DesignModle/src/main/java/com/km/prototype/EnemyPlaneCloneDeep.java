package com.km.prototype;

public class EnemyPlaneCloneDeep {

    //敌机横坐标
    private int x;
    //敌机纵坐标
    private int y =0;

    private Bullet bullet;

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public EnemyPlaneCloneDeep(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x=x;
    }

    public int getY(){
        return y;
    }

    //让敌机飞
    public void fly(){
        y++;
    }

    public EnemyPlaneCloneDeep clone() throws CloneNotSupportedException{
        EnemyPlaneCloneDeep clone = (EnemyPlaneCloneDeep) super.clone();
        clone.setBullet((Bullet) this.bullet.clone());
        return clone;
    }

}
