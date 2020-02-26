package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    public boolean mo1106i() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0035bg.m3102a(context, (int) R.attr.preferenceCategoryStyle, 16842892), (byte) 0);
    }

    /* renamed from: a */
    public void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        if (Build.VERSION.SDK_INT >= 28) {
            rlVar.f9783a.setAccessibilityHeading(true);
        } else {
            int i = Build.VERSION.SDK_INT;
        }
    }

    @Deprecated
    /* renamed from: a */
    public final void mo1087a(C0114ed edVar) {
        C0113ec ecVar;
        if (Build.VERSION.SDK_INT < 28) {
            int i = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = edVar.f9123a.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                ecVar = new C0113ec(collectionItemInfo);
            } else {
                ecVar = null;
            }
            if (ecVar != null) {
                int i2 = Build.VERSION.SDK_INT;
                int rowIndex = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.f9122a).getRowIndex();
                int i3 = Build.VERSION.SDK_INT;
                int rowSpan = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.f9122a).getRowSpan();
                int i4 = Build.VERSION.SDK_INT;
                int columnIndex = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.f9122a).getColumnIndex();
                int i5 = Build.VERSION.SDK_INT;
                int columnSpan = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.f9122a).getColumnSpan();
                int i6 = Build.VERSION.SDK_INT;
                edVar.mo4700a(C0113ec.m7230a(rowIndex, rowSpan, columnIndex, columnSpan, true, ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.f9122a).isSelected()));
            }
        }
    }

    /* renamed from: c */
    public final boolean mo1076c() {
        return !super.mo1106i();
    }
}
