package p000;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: iy */
/* compiled from: PG */
final class C0243iy implements View.OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ C0246ja f9650a;

    public C0243iy(C0246ja jaVar) {
        this.f9650a = jaVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0) {
            PopupWindow popupWindow = this.f9650a.f9674n;
            if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.f9650a.f9674n.getWidth() || y < 0 || y >= this.f9650a.f9674n.getHeight()) {
                return false;
            }
            C0246ja jaVar = this.f9650a;
            jaVar.f9672l.postDelayed(jaVar.f9671k, 250);
            return false;
        } else if (action != 1) {
            return false;
        } else {
            C0246ja jaVar2 = this.f9650a;
            jaVar2.f9672l.removeCallbacks(jaVar2.f9671k);
            return false;
        }
    }
}
