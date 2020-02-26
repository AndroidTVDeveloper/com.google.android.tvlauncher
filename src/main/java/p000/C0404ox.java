package p000;

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

/* renamed from: ox */
/* compiled from: PG */
public class C0404ox extends EditText {

    /* renamed from: b */
    public int f10098b;

    static {
        Pattern.compile("\\S+");
        new C0403ow(Integer.class, "streamPosition");
    }

    public C0404ox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Random();
    }

    public C0404ox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new Random();
    }

    /* renamed from: a */
    private final void m8160a(int i) {
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), i);
        Bitmap.createScaledBitmap(decodeResource, (int) (((float) decodeResource.getWidth()) * 1.3f), (int) (((float) decodeResource.getHeight()) * 1.3f), false);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m8160a(R.drawable.lb_text_dot_one);
        m8160a(R.drawable.lb_text_dot_two);
        this.f10098b = -1;
        setText("");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.leanback.widget.StreamingTextView");
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0194hc.m7484a(this, callback));
    }
}
