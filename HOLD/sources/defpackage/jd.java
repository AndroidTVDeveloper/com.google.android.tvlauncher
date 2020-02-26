package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: jd  reason: default package */
/* compiled from: PG */
public final class jd extends ja implements jb {
    public static Method o;
    public jb p;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                o = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException e) {
        }
    }

    public jd(Context context, int i) {
        super(context, i);
    }

    public final ie a(Context context, boolean z) {
        jc jcVar = new jc(context, z);
        jcVar.c = this;
        return jcVar;
    }
}
