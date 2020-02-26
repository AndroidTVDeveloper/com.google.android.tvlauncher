package p000;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: jd */
/* compiled from: PG */
public final class C0249jd extends C0246ja implements C0247jb {

    /* renamed from: o */
    public static Method f9689o;

    /* renamed from: p */
    public C0247jb f9690p;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f9689o = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException e) {
        }
    }

    public C0249jd(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public final C0223ie mo5283a(Context context, boolean z) {
        C0248jc jcVar = new C0248jc(context, z);
        jcVar.f9685c = this;
        return jcVar;
    }
}
