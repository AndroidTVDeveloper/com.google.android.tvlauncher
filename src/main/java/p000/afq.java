package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: afq */
/* compiled from: PG */
public final class afq implements Handler.Callback {

    /* renamed from: f */
    private static final afp f242f = new afo();

    /* renamed from: a */
    private volatile C0512sx f243a;

    /* renamed from: b */
    private final Map f244b = new HashMap();

    /* renamed from: c */
    private final Map f245c = new HashMap();

    /* renamed from: d */
    private final Handler f246d;

    /* renamed from: e */
    private final afp f247e;

    public afq() {
        new C0067cl();
        new C0067cl();
        new Bundle();
        this.f247e = f242f;
        this.f246d = new Handler(Looper.getMainLooper(), this);
    }

    /* renamed from: b */
    private static void m305b(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: c */
    private static Activity m307c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m307c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    /* renamed from: a */
    public final C0512sx mo173a(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        afn a = mo170a(fragmentManager, fragment, z);
        C0512sx sxVar = a.f238c;
        if (sxVar != null) {
            return sxVar;
        }
        C0512sx a2 = this.f247e.mo169a(C0497si.m8291a(context), a.f236a, a.f237b, context);
        a.f238c = a2;
        return a2;
    }

    /* renamed from: a */
    public final C0512sx mo171a(Activity activity) {
        if (aie.m566c()) {
            return mo172a(activity.getApplicationContext());
        }
        m305b(activity);
        return mo173a(activity, activity.getFragmentManager(), null, m306b((Context) activity));
    }

    /* renamed from: a */
    public final C0512sx mo172a(Context context) {
        if (context != null) {
            if (aie.m563b() && !(context instanceof Application)) {
                if (context instanceof C0005af) {
                    C0005af afVar = (C0005af) context;
                    if (aie.m566c()) {
                        return mo172a(afVar.getApplicationContext());
                    }
                    m305b((Activity) afVar);
                    throw null;
                } else if (context instanceof Activity) {
                    return mo171a((Activity) context);
                } else {
                    if (context instanceof ContextWrapper) {
                        ContextWrapper contextWrapper = (ContextWrapper) context;
                        if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                            return mo172a(contextWrapper.getBaseContext());
                        }
                    }
                }
            }
            if (this.f243a == null) {
                synchronized (this) {
                    if (this.f243a == null) {
                        this.f243a = this.f247e.mo169a(C0497si.m8291a(context.getApplicationContext()), new afb(), new afi(), context.getApplicationContext());
                    }
                }
            }
            return this.f243a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: a */
    public final afn mo170a(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        afn afn = (afn) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (afn == null && (afn = (afn) this.f244b.get(fragmentManager)) == null) {
            afn = new afn();
            afn.f239d = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                afn.mo162a(fragment.getActivity());
            }
            if (z) {
                afn.f236a.mo154a();
            }
            this.f244b.put(fragmentManager, afn);
            fragmentManager.beginTransaction().add(afn, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f246d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return afn;
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        C0007ah ahVar;
        int i = message.what;
        Object obj = null;
        if (i == 1) {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            ahVar = fragmentManager;
            obj = this.f244b.remove(fragmentManager);
            z = true;
        } else if (i != 2) {
            z = false;
            ahVar = null;
        } else {
            C0007ah ahVar2 = (C0007ah) message.obj;
            ahVar = ahVar2;
            obj = this.f245c.remove(ahVar2);
            z = true;
        }
        if (!z || obj != null || !Log.isLoggable("RMRetriever", 5)) {
            return z;
        }
        String valueOf = String.valueOf(ahVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("Failed to remove expected request manager fragment, manager: ");
        sb.append(valueOf);
        Log.w("RMRetriever", sb.toString());
        return true;
    }

    /* renamed from: b */
    public static boolean m306b(Context context) {
        Activity c = m307c(context);
        return c == null || !c.isFinishing();
    }
}
