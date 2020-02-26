package p000;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: hk */
/* compiled from: PG */
public class C0202hk extends TextView implements C0121ek {

    /* renamed from: b */
    private final C0189gy f9474b;

    /* renamed from: c */
    private final C0201hj f9475c;

    /* renamed from: d */
    private final C0199hh f9476d;

    public C0202hk(Context context) {
        this(context, null);
    }

    public C0202hk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public C0202hk(Context context, AttributeSet attributeSet, int i) {
        super(C0295kw.m7862a(context), attributeSet, i);
        C0189gy gyVar = new C0189gy(this);
        this.f9474b = gyVar;
        gyVar.mo5101a(attributeSet, i);
        C0201hj hjVar = new C0201hj(this);
        this.f9475c = hjVar;
        hjVar.mo5139a(attributeSet, i);
        this.f9475c.mo5137a();
        this.f9476d = new C0199hh(this);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0189gy gyVar = this.f9474b;
        if (gyVar != null) {
            gyVar.mo5099a();
        }
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final int getAutoSizeMaxTextSize() {
        if (f9154a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            return hjVar.f9463b.mo5177c();
        }
        return -1;
    }

    public final int getAutoSizeMinTextSize() {
        if (f9154a) {
            return super.getAutoSizeMinTextSize();
        }
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            return hjVar.f9463b.mo5176b();
        }
        return -1;
    }

    public final int getAutoSizeStepGranularity() {
        if (f9154a) {
            return super.getAutoSizeStepGranularity();
        }
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            return hjVar.f9463b.mo5173a();
        }
        return -1;
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        if (f9154a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0201hj hjVar = this.f9475c;
        return hjVar != null ? hjVar.f9463b.f9484f : new int[0];
    }

    public final int getAutoSizeTextType() {
        if (f9154a) {
            return super.getAutoSizeTextType() != 1 ? 0 : 1;
        }
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            return hjVar.f9463b.f9479a;
        }
        return 0;
    }

    public final int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public final int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public final TextClassifier getTextClassifier() {
        C0199hh hhVar;
        if (Build.VERSION.SDK_INT >= 28 || (hhVar = this.f9476d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = hhVar.f9459b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) hhVar.f9458a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C0194hc.m7485a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null && !C0121ek.f9154a) {
            hjVar.mo5140b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f9475c != null && !f9154a && this.f9475c.mo5141c()) {
            this.f9475c.mo5140b();
        }
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (!f9154a) {
            C0201hj hjVar = this.f9475c;
            if (hjVar != null) {
                C0203hl hlVar = hjVar.f9463b;
                if (hlVar.mo5182h()) {
                    DisplayMetrics displayMetrics = hlVar.f9486h.getResources().getDisplayMetrics();
                    hlVar.mo5174a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
                    if (hlVar.mo5179e()) {
                        hlVar.mo5180f();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (!f9154a) {
            C0201hj hjVar = this.f9475c;
            if (hjVar != null) {
                C0203hl hlVar = hjVar.f9463b;
                if (hlVar.mo5182h()) {
                    int length = iArr.length;
                    if (length > 0) {
                        int[] iArr2 = new int[length];
                        if (i == 0) {
                            iArr2 = Arrays.copyOf(iArr, length);
                        } else {
                            DisplayMetrics displayMetrics = hlVar.f9486h.getResources().getDisplayMetrics();
                            for (int i2 = 0; i2 < length; i2++) {
                                iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                            }
                        }
                        hlVar.f9484f = C0203hl.m7506a(iArr2);
                        if (!hlVar.mo5178d()) {
                            throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                        }
                    } else {
                        hlVar.f9485g = false;
                    }
                    if (hlVar.mo5179e()) {
                        hlVar.mo5180f();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public final void setAutoSizeTextTypeWithDefaults(int i) {
        if (!f9154a) {
            C0201hj hjVar = this.f9475c;
            if (hjVar != null) {
                C0203hl hlVar = hjVar.f9463b;
                if (!hlVar.mo5182h()) {
                    return;
                }
                if (i == 0) {
                    hlVar.f9479a = 0;
                    hlVar.f9482d = -1.0f;
                    hlVar.f9483e = -1.0f;
                    hlVar.f9481c = -1.0f;
                    hlVar.f9484f = new int[0];
                    hlVar.f9480b = false;
                } else if (i == 1) {
                    DisplayMetrics displayMetrics = hlVar.f9486h.getResources().getDisplayMetrics();
                    hlVar.mo5174a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (hlVar.mo5179e()) {
                        hlVar.mo5180f();
                    }
                } else {
                    throw new IllegalArgumentException("Unknown auto-size text type: " + i);
                }
            }
        } else {
            super.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0189gy gyVar = this.f9474b;
        if (gyVar != null) {
            gyVar.mo5102b();
        }
    }

    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0189gy gyVar = this.f9474b;
        if (gyVar != null) {
            gyVar.mo5100a(i);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C0129es.m7262b(context, i) : null;
        Drawable b2 = i2 != 0 ? C0129es.m7262b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C0129es.m7262b(context, i3) : null;
        if (i4 != 0) {
            drawable = C0129es.m7262b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b, b2, b3, drawable);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b = i != 0 ? C0129es.m7262b(context, i) : null;
        Drawable b2 = i2 != 0 ? C0129es.m7262b(context, i2) : null;
        Drawable b3 = i3 != 0 ? C0129es.m7262b(context, i3) : null;
        if (i4 != 0) {
            drawable = C0129es.m7262b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b, b2, b3, drawable);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5137a();
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0194hc.m7484a(this, callback));
    }

    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0194hc.m7487a(this, i);
        }
    }

    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0194hc.m7488b(this, i);
        }
    }

    public final void setLineHeight(int i) {
        C0194hc.m7490c(this, i);
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0201hj hjVar = this.f9475c;
        if (hjVar != null) {
            hjVar.mo5138a(context, i);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        C0199hh hhVar;
        if (Build.VERSION.SDK_INT >= 28 || (hhVar = this.f9476d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            hhVar.f9459b = textClassifier;
        }
    }

    public final void setTextSize(int i, float f) {
        if (!f9154a) {
            C0201hj hjVar = this.f9475c;
            if (hjVar != null && !C0121ek.f9154a && !hjVar.mo5141c()) {
                hjVar.f9463b.mo5175a(i, f);
                return;
            }
            return;
        }
        super.setTextSize(i, f);
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = C0036bh.m3214a(getContext(), typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }
}
