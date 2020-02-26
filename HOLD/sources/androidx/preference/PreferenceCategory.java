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

    public boolean i() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, bg.a(context, (int) R.attr.preferenceCategoryStyle, 16842892), (byte) 0);
    }

    public void a(rl rlVar) {
        super.a(rlVar);
        if (Build.VERSION.SDK_INT >= 28) {
            rlVar.a.setAccessibilityHeading(true);
        } else {
            int i = Build.VERSION.SDK_INT;
        }
    }

    @Deprecated
    public final void a(ed edVar) {
        ec ecVar;
        if (Build.VERSION.SDK_INT < 28) {
            int i = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = edVar.a.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                ecVar = new ec(collectionItemInfo);
            } else {
                ecVar = null;
            }
            if (ecVar != null) {
                int i2 = Build.VERSION.SDK_INT;
                int rowIndex = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.a).getRowIndex();
                int i3 = Build.VERSION.SDK_INT;
                int rowSpan = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.a).getRowSpan();
                int i4 = Build.VERSION.SDK_INT;
                int columnIndex = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.a).getColumnIndex();
                int i5 = Build.VERSION.SDK_INT;
                int columnSpan = ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.a).getColumnSpan();
                int i6 = Build.VERSION.SDK_INT;
                edVar.a(ec.a(rowIndex, rowSpan, columnIndex, columnSpan, true, ((AccessibilityNodeInfo.CollectionItemInfo) ecVar.a).isSelected()));
            }
        }
    }

    public final boolean c() {
        return !super.i();
    }
}
