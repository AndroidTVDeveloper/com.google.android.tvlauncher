package defpackage;

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

/* renamed from: afq  reason: default package */
/* compiled from: PG */
public final class afq implements Handler.Callback {
    private static final afp f = new afo();
    private volatile sx a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Handler d;
    private final afp e;

    public afq() {
        new cl();
        new cl();
        new Bundle();
        this.e = f;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    private static void b(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    public final sx a(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        afn a2 = a(fragmentManager, fragment, z);
        sx sxVar = a2.c;
        if (sxVar != null) {
            return sxVar;
        }
        sx a3 = this.e.a(si.a(context), a2.a, a2.b, context);
        a2.c = a3;
        return a3;
    }

    public final sx a(Activity activity) {
        if (aie.c()) {
            return a(activity.getApplicationContext());
        }
        b(activity);
        return a(activity, activity.getFragmentManager(), null, b((Context) activity));
    }

    public final sx a(Context context) {
        if (context != null) {
            if (aie.b() && !(context instanceof Application)) {
                if (context instanceof af) {
                    af afVar = (af) context;
                    if (aie.c()) {
                        return a(afVar.getApplicationContext());
                    }
                    b((Activity) afVar);
                    throw null;
                } else if (context instanceof Activity) {
                    return a((Activity) context);
                } else {
                    if (context instanceof ContextWrapper) {
                        ContextWrapper contextWrapper = (ContextWrapper) context;
                        if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                            return a(contextWrapper.getBaseContext());
                        }
                    }
                }
            }
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = this.e.a(si.a(context.getApplicationContext()), new afb(), new afi(), context.getApplicationContext());
                    }
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final afn a(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        afn afn = (afn) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (afn == null && (afn = (afn) this.b.get(fragmentManager)) == null) {
            afn = new afn();
            afn.d = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                afn.a(fragment.getActivity());
            }
            if (z) {
                afn.a.a();
            }
            this.b.put(fragmentManager, afn);
            fragmentManager.beginTransaction().add(afn, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return afn;
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        ah ahVar;
        int i = message.what;
        Object obj = null;
        if (i == 1) {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            ahVar = fragmentManager;
            obj = this.b.remove(fragmentManager);
            z = true;
        } else if (i != 2) {
            z = false;
            ahVar = null;
        } else {
            ah ahVar2 = (ah) message.obj;
            ahVar = ahVar2;
            obj = this.c.remove(ahVar2);
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

    public static boolean b(Context context) {
        Activity c2 = c(context);
        return c2 == null || !c2.isFinishing();
    }
}
