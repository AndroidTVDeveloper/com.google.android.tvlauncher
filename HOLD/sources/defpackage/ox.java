package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.tvlauncher.R;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: ox  reason: default package */
/* compiled from: PG */
public class ox extends EditText {
    public int b;

    static {
        Pattern.compile("\\S+");
        new ow(Integer.class, "streamPosition");
    }

    public ox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Random();
    }

    public ox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Random();
    }

    private final void a(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
        Bitmap.createScaledBitmap(decodeResource, (int) (((float) decodeResource.getWidth()) * 1.3f), (int) (((float) decodeResource.getHeight()) * 1.3f), false);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        a(R.drawable.lb_text_dot_one);
        a(R.drawable.lb_text_dot_two);
        this.b = -1;
        setText("");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(hc.a(this, callback));
    }
}
