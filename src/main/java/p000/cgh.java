package p000;

import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;

/* renamed from: cgh */
/* compiled from: PG */
public final class cgh implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ AddAppLinkActivity f5463a;

    /* renamed from: b */
    private final /* synthetic */ dby f5464b;

    public cgh(AddAppLinkActivity addAppLinkActivity, dby dby) {
        this.f5463a = addAppLinkActivity;
        this.f5464b = dby;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cfs.<init>(int, char):void
     arg types: [int, int]
     candidates:
      cfs.<init>(int, byte):void
      cfs.<init>(int, char):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    public final void onClick(View view) {
        cfs cfs = new cfs(25, 0);
        dja h = cfs.mo2735h();
        String str = this.f5464b.f8184b;
        if (h.f8673b) {
            h.mo4505b();
            h.f8673b = false;
        }
        dmi dmi = (dmi) h.f8672a;
        dmi dmi2 = dmi.f8827e;
        str.getClass();
        int i = dmi.f8828a | 1;
        dmi.f8828a = i;
        dmi.f8829b = str;
        String str2 = this.f5464b.f8186d;
        str2.getClass();
        dmi.f8828a = i | 2;
        dmi.f8830c = str2;
        this.f5463a.f6378a.mo2714a(cfs);
        AddAppLinkActivity addAppLinkActivity = this.f5463a;
        dby dby = this.f5464b;
        addAppLinkActivity.startActivity(dbk.m6088a(dby.f8184b, dby.f8186d));
        Intent intent = new Intent();
        intent.putExtra("extra_launched_virtual_app", true);
        this.f5463a.setResult(-1, intent);
        this.f5463a.finish();
    }
}
