package net.nerdcorner.android.myapplication;

import android.graphics.Canvas;

public interface GameObject {
    public void draw(Canvas canvas);
    public void update();
}
