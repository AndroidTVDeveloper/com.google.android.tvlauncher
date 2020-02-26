package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.TextView;

/* compiled from: PG */
public class GuidedActionEditText extends EditText {
    private final Drawable a;
    private final Drawable b;

    public GuidedActionEditText(Context context) {
        this(context, null);
    }

    public final int getAutofillType() {
        return 1;
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842862);
    }

    public GuidedActionEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = getBackground();
        nu nuVar = new nu();
        this.b = nuVar;
        setBackground(nuVar);
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setBackground(this.a);
            return;
        }
        setBackground(this.b);
        setFocusable(false);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((isFocused() ? EditText.class : TextView.class).getName());
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hc.a(this, callback));
    }
}
