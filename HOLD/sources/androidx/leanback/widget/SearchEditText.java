package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;

/* compiled from: PG */
public class SearchEditText extends ox {
    public op a;

    static {
        SearchEditText.class.getSimpleName();
    }

    public SearchEditText(Context context) {
        this(context, null);
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2131951964);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.a != null) {
            post(new oo());
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
