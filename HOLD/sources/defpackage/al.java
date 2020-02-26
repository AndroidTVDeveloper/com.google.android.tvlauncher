package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: al  reason: default package */
/* compiled from: PG */
public final class al extends ah implements LayoutInflater.Factory2 {
    static {
        new DecelerateInterpolator(2.5f);
        new DecelerateInterpolator(1.5f);
    }

    public al() {
        new ArrayList();
        new HashMap();
        new bks((byte) 0);
        new CopyOnWriteArrayList();
        new ai();
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ak.a);
            int i = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null && ag.a(context.getClassLoader(), attributeValue)) {
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
                    if (super.a() == a) {
                        this.b = new aj();
                    }
                    ad b = super.a().b(context.getClassLoader(), attributeValue);
                    b.a = true;
                    b.d = -1;
                    b.e = -1;
                    b.f = null;
                    b.b = true;
                    b.c = this;
                    b.g = null;
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
        dc.a((Object) null, sb);
        sb.append("}}");
        return sb.toString();
    }
}
