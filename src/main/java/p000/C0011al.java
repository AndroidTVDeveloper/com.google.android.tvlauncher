package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: al */
/* compiled from: PG */
public final class C0011al extends C0007ah implements LayoutInflater.Factory2 {
    static {
        new DecelerateInterpolator(2.5f);
        new DecelerateInterpolator(1.5f);
    }

    public C0011al() {
        new ArrayList();
        new HashMap();
        new bks((byte) 0);
        new CopyOnWriteArrayList();
        new C0008ai();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0010ak.f499a);
            int i = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null && C0006ag.m322a(context.getClassLoader(), attributeValue)) {
                if (view != null) {
                    i = view.getId();
                }
                if (i == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                } else if (resourceId != -1) {
                    throw null;
                } else if (string != null) {
                    throw null;
                } else if (i == -1) {
                    if (super.mo252a() == f357a) {
                        this.f358b = new C0009aj();
                    }
                    C0003ad b = super.mo252a().mo179b(context.getClassLoader(), attributeValue);
                    b.f119a = true;
                    b.f122d = -1;
                    b.f123e = -1;
                    b.f124f = null;
                    b.f120b = true;
                    b.f121c = this;
                    b.f125g = null;
                    throw null;
                } else {
                    throw null;
                }
            }
        }
        return null;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0086dc.m6106a((Object) null, sb);
        sb.append("}}");
        return sb.toString();
    }
}
