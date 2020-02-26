package defpackage;

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

/* renamed from: hk  reason: default package */
/* compiled from: PG */
public class hk extends TextView implements ek {
    private final gy b;
    private final hj c;
    private final hh d;

    public hk(Context context) {
        this(context, null);
    }

    public hk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public hk(Context context, AttributeSet attributeSet, int i) {
        super(kw.a(context), attributeSet, i);
        gy gyVar = new gy(this);
        this.b = gyVar;
        gyVar.a(attributeSet, i);
        hj hjVar = new hj(this);
        this.c = hjVar;
        hjVar.a(attributeSet, i);
        this.c.a();
        this.d = new hh(this);
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

    public final int getAutoSizeMaxTextSize() {
        if (a) {
            return super.getAutoSizeMaxTextSize();
        }
        hj hjVar = this.c;
        if (hjVar != null) {
            return hjVar.b.c();
        }
        return -1;
    }

    public final int getAutoSizeMinTextSize() {
        if (a) {
            return super.getAutoSizeMinTextSize();
        }
        hj hjVar = this.c;
        if (hjVar != null) {
            return hjVar.b.b();
        }
        return -1;
    }

    public final int getAutoSizeStepGranularity() {
        if (a) {
            return super.getAutoSizeStepGranularity();
        }
        hj hjVar = this.c;
        if (hjVar != null) {
            return hjVar.b.a();
        }
        return -1;
    }

    public final int[] getAutoSizeTextAvailableSizes() {
        if (a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        hj hjVar = this.c;
        return hjVar != null ? hjVar.b.f : new int[0];
    }

    public final int getAutoSizeTextType() {
        if (a) {
            return super.getAutoSizeTextType() != 1 ? 0 : 1;
        }
        hj hjVar = this.c;
        if (hjVar != null) {
            return hjVar.b.a;
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
        hh hhVar;
        if (Build.VERSION.SDK_INT >= 28 || (hhVar = this.d) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = hhVar.b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) hhVar.a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return hc.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hj hjVar = this.c;
        if (hjVar != null && !ek.a) {
            hjVar.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.c != null && !a && this.c.c()) {
            this.c.b();
        }
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (!a) {
            hj hjVar = this.c;
            if (hjVar != null) {
                hl hlVar = hjVar.b;
                if (hlVar.h()) {
                    DisplayMetrics displayMetrics = hlVar.h.getResources().getDisplayMetrics();
                    hlVar.a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
                    if (hlVar.e()) {
                        hlVar.f();
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
        if (!a) {
            hj hjVar = this.c;
            if (hjVar != null) {
                hl hlVar = hjVar.b;
                if (hlVar.h()) {
                    int length = iArr.length;
                    if (length > 0) {
                        int[] iArr2 = new int[length];
                        if (i == 0) {
                            iArr2 = Arrays.copyOf(iArr, length);
                        } else {
                            DisplayMetrics displayMetrics = hlVar.h.getResources().getDisplayMetrics();
                            for (int i2 = 0; i2 < length; i2++) {
                                iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                            }
                        }
                        hlVar.f = hl.a(iArr2);
                        if (!hlVar.d()) {
                            throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                        }
                    } else {
                        hlVar.g = false;
                    }
                    if (hlVar.e()) {
                        hlVar.f();
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
        if (!a) {
            hj hjVar = this.c;
            if (hjVar != null) {
                hl hlVar = hjVar.b;
                if (!hlVar.h()) {
                    return;
                }
                if (i == 0) {
                    hlVar.a = 0;
                    hlVar.d = -1.0f;
                    hlVar.e = -1.0f;
                    hlVar.c = -1.0f;
                    hlVar.f = new int[0];
                    hlVar.b = false;
                } else if (i == 1) {
                    DisplayMetrics displayMetrics = hlVar.h.getResources().getDisplayMetrics();
                    hlVar.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (hlVar.e()) {
                        hlVar.f();
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

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? es.b(context, i) : null;
        Drawable b3 = i2 != 0 ? es.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? es.b(context, i3) : null;
        if (i4 != 0) {
            drawable = es.b(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i != 0 ? es.b(context, i) : null;
        Drawable b3 = i2 != 0 ? es.b(context, i2) : null;
        Drawable b4 = i3 != 0 ? es.b(context, i3) : null;
        if (i4 != 0) {
            drawable = es.b(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a();
        }
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hc.a(this, callback));
    }

    public final void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            hc.a(this, i);
        }
    }

    public final void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            hc.b(this, i);
        }
    }

    public final void setLineHeight(int i) {
        hc.c(this, i);
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        hj hjVar = this.c;
        if (hjVar != null) {
            hjVar.a(context, i);
        }
    }

    public final void setTextClassifier(TextClassifier textClassifier) {
        hh hhVar;
        if (Build.VERSION.SDK_INT >= 28 || (hhVar = this.d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            hhVar.b = textClassifier;
        }
    }

    public final void setTextSize(int i, float f) {
        if (!a) {
            hj hjVar = this.c;
            if (hjVar != null && !ek.a && !hjVar.c()) {
                hjVar.b.a(i, f);
                return;
            }
            return;
        }
        super.setTextSize(i, f);
    }

    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2 = null;
        if (typeface != null && i > 0) {
            typeface2 = bh.a(getContext(), typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }
}
