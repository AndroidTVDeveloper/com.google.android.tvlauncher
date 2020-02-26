package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;

/* renamed from: cgh  reason: default package */
/* compiled from: PG */
public final class cgh implements View.OnClickListener {
    private final /* synthetic */ AddAppLinkActivity a;
    private final /* synthetic */ dby b;

    public cgh(AddAppLinkActivity addAppLinkActivity, dby dby) {
        this.a = addAppLinkActivity;
        this.b = dby;
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
        dja h = cfs.h();
        String str = this.b.b;
        if (h.b) {
            h.b();
            h.b = false;
        }
        dmi dmi = (dmi) h.a;
        dmi dmi2 = dmi.e;
        str.getClass();
        int i = dmi.a | 1;
        dmi.a = i;
        dmi.b = str;
        String str2 = this.b.d;
        str2.getClass();
        dmi.a = i | 2;
        dmi.c = str2;
        this.a.a.a(cfs);
        AddAppLinkActivity addAppLinkActivity = this.a;
        dby dby = this.b;
        addAppLinkActivity.startActivity(dbk.a(dby.b, dby.d));
        Intent intent = new Intent();
        intent.putExtra("extra_launched_virtual_app", true);
        this.a.setResult(-1, intent);
        this.a.finish();
    }
}
