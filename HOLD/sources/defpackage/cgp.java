package defpackage;

import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;

/* renamed from: cgp  reason: default package */
/* compiled from: PG */
final class cgp implements chr {
    public final /* synthetic */ cgt a;

    public cgp(cgt cgt) {
        this.a = cgt;
    }

    public final void a(Intent intent, View view) {
        try {
            this.a.h = false;
            if (!"com.android.tv.applink.action.ADD_APP_LINK".equals(intent.getAction())) {
                dbq.a(intent, view);
                this.a.e.a(false);
                return;
            }
            this.a.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException | SecurityException e) {
            Toast.makeText(this.a.getContext(), (int) R.string.failed_launch, 0).show();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot start activity : ");
            sb.append(valueOf);
            Log.e("AppsViewFragment", sb.toString());
        }
    }

    public final void a(int i, int i2) {
        int i3;
        int i4;
        FragmentTransaction beginTransaction = this.a.getFragmentManager().beginTransaction();
        cij cij = this.a.a;
        if (i != 1 || !cij.g(2)) {
            i3 = cij.f(cij.k.indexOf(1));
        } else {
            i3 = cij.f(cij.k.indexOf(2));
        }
        cij cij2 = this.a.a;
        if (i == 1 && cij2.g(2)) {
            i4 = cij2.f(cij2.k.lastIndexOf(2));
        } else {
            i4 = cij2.f(cij2.k.lastIndexOf(1));
        }
        Bundle bundle = new Bundle();
        bundle.putInt("key_edit_mode_type", i);
        bundle.putInt("key_edit_mode_focused_position", i2);
        bundle.putInt("key_top_keyline", i3);
        bundle.putInt("key_bottom_keyline", i4);
        chc chc = new chc();
        chc.setArguments(bundle);
        beginTransaction.replace(16908290, chc, "edit_mode_fragment").addToBackStack(null).commit();
    }

    public final void a(Intent intent, cek cek, View view) {
        try {
            String a2 = cgb.a(intent);
            cfs cfs = new cfs(25, (byte) 0);
            cfs.b(cek);
            if (a2 != null) {
                dja g = cfs.g();
                if (g.b) {
                    g.b();
                    g.b = false;
                }
                dmj dmj = (dmj) g.a;
                dmj dmj2 = dmj.f;
                a2.getClass();
                dmj.a |= 1;
                dmj.b = a2;
            }
            this.a.d.a(cfs);
            this.a.h = false;
            dbq.a(intent, view);
            this.a.e.a(false);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.a.getContext(), (int) R.string.failed_launch, 0).show();
            String a3 = cgb.a(intent);
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 44 + String.valueOf(valueOf).length());
            sb.append("Cannot start store with package: ");
            sb.append(a3);
            sb.append(", due to : ");
            sb.append(valueOf);
            Log.e("AppsViewFragment", sb.toString());
        }
    }
}
