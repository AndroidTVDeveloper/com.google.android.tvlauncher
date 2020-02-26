package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: iy  reason: default package */
/* compiled from: PG */
final class iy implements View.OnTouchListener {
    private final /* synthetic */ ja a;

    public iy(ja jaVar) {
        this.a = jaVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            PopupWindow popupWindow = this.a.n;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.n.getWidth() || y < 0 || y >= this.a.n.getHeight()) {
                return false;
            }
            ja jaVar = this.a;
            jaVar.l.postDelayed(jaVar.k, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            ja jaVar2 = this.a;
            jaVar2.l.removeCallbacks(jaVar2.k);
            return false;
        }
    }
}
