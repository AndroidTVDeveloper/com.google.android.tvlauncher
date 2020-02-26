package p000;

import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import com.google.android.tvlauncher.R;

/* renamed from: cgp */
/* compiled from: PG */
final class cgp implements chr {

    /* renamed from: a */
    public final /* synthetic */ cgt f5475a;

    public cgp(cgt cgt) {
        this.f5475a = cgt;
    }

    /* renamed from: a */
    public final void mo2763a(Intent intent, View view) {
        try {
            this.f5475a.f5486h = false;
            if (!"com.android.tv.applink.action.ADD_APP_LINK".equals(intent.getAction())) {
                dbq.m6096a(intent, view);
                this.f5475a.f5483e.mo2766a(false);
                return;
            }
            this.f5475a.startActivityForResult(intent, 0);
        } catch (ActivityNotFoundException | SecurityException e) {
            Toast.makeText(this.f5475a.getContext(), (int) R.string.failed_launch, 0).show();
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot start activity : ");
            sb.append(valueOf);
            Log.e("AppsViewFragment", sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo2762a(int i, int i2) {
        int i3;
        int i4;
        FragmentTransaction beginTransaction = this.f5475a.getFragmentManager().beginTransaction();
        cij cij = this.f5475a.f5479a;
        if (i != 1 || !cij.mo2858g(2)) {
            i3 = cij.mo2856f(cij.f5629k.indexOf(1));
        } else {
            i3 = cij.mo2856f(cij.f5629k.indexOf(2));
        }
        cij cij2 = this.f5475a.f5479a;
        if (i == 1 && cij2.mo2858g(2)) {
            i4 = cij2.mo2856f(cij2.f5629k.lastIndexOf(2));
        } else {
            i4 = cij2.mo2856f(cij2.f5629k.lastIndexOf(1));
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

    /* renamed from: a */
    public final void mo2764a(Intent intent, cek cek, View view) {
        try {
            String a = cgb.m4698a(intent);
            cfs cfs = new cfs(25, (byte) 0);
            cfs.mo2729b(cek);
            if (a != null) {
                dja g = cfs.mo2734g();
                if (g.f8673b) {
                    g.mo4505b();
                    g.f8673b = false;
                }
                dmj dmj = (dmj) g.f8672a;
                dmj dmj2 = dmj.f8832f;
                a.getClass();
                dmj.f8833a |= 1;
                dmj.f8834b = a;
            }
            this.f5475a.f5482d.mo2714a(cfs);
            this.f5475a.f5486h = false;
            dbq.m6096a(intent, view);
            this.f5475a.f5483e.mo2766a(false);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this.f5475a.getContext(), (int) R.string.failed_launch, 0).show();
            String a2 = cgb.m4698a(intent);
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 44 + String.valueOf(valueOf).length());
            sb.append("Cannot start store with package: ");
            sb.append(a2);
            sb.append(", due to : ");
            sb.append(valueOf);
            Log.e("AppsViewFragment", sb.toString());
        }
    }
}
