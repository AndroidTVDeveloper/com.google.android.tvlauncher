package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.tvlauncher.R;

/* renamed from: gx  reason: default package */
/* compiled from: PG */
public class gx extends AutoCompleteTextView {
    private static final int[] a = {16843126};
    private final gy b;
    private final hj c;

    public gx(Context context) {
        this(context, null);
    }

    public gx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public gx(Context context, AttributeSet attributeSet, int i) {
        super(kw.a(context), attributeSet, i);
        kz a2 = kz.a(getContext(), attributeSet, a, i);
        if (a2.e(0)) {
            setDropDownBackgroundDrawable(a2.a(0));
        }
        a2.a();
        gy gyVar = new gy(this);
        this.b = gyVar;
        gyVar.a(attributeSet, i);
        hj hjVar = new hj(this);
        this.c = hjVar;
        hjVar.a(attributeSet, i);
        this.c.a();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        gy gyVar = this.b;
        if (gyVar != null) {
            gyVar.a();
        }
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return hc.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gy gyVar = this.b;
        if (gyVar != null) {
            gyVar.b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gy gyVar = this.b;
        if (gyVar != null) {
            gyVar.a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hc.a(this, callback));
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(es.b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a(context, i);
        }
    }
}
