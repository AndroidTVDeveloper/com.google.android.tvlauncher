package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.android.tvlauncher.R;

/* renamed from: gx */
/* compiled from: PG */
public class C0188gx extends AutoCompleteTextView {

    /* renamed from: a */
    private static final int[] f9434a = {16843126};

    /* renamed from: b */
    private final C0189gy f9435b;

    /* renamed from: c */
    private final C0201hj f9436c;

    public C0188gx(Context context) {
        this(context, null);
    }

    public C0188gx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    public C0188gx(Context context, AttributeSet attributeSet, int i) {
        super(C0295kw.m7862a(context), attributeSet, i);
        C0298kz a = C0298kz.m7865a(getContext(), attributeSet, f9434a, i);
        if (a.mo5522e(0)) {
            setDropDownBackgroundDrawable(a.mo5512a(0));
        }
        a.mo5513a();
        C0189gy gyVar = new C0189gy(this);
        this.f9435b = gyVar;
        gyVar.mo5101a(attributeSet, i);
        C0201hj hjVar = new C0201hj(this);
        this.f9436c = hjVar;
        hjVar.mo5139a(attributeSet, i);
        this.f9436c.mo5137a();
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0189gy gyVar = this.f9435b;
        if (gyVar != null) {
            gyVar.mo5099a();
        }
        C0201hj hjVar = this.f9436c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0194hc.m7485a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0189gy gyVar = this.f9435b;
        if (gyVar != null) {
            gyVar.mo5102b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0189gy gyVar = this.f9435b;
        if (gyVar != null) {
            gyVar.mo5100a(i);
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0194hc.m7484a(this, callback));
    }

    public final void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C0129es.m7262b(getContext(), i));
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0201hj hjVar = this.f9436c;
        if (hjVar != null) {
            hjVar.mo5138a(context, i);
        }
    }
}
