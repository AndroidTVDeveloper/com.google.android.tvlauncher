package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cgi  reason: default package */
/* compiled from: PG */
public final class cgi implements View.OnClickListener {
    private final /* synthetic */ AddAppLinkActivity a;
    private final /* synthetic */ dby b;

    public cgi(AddAppLinkActivity addAppLinkActivity, dby dby) {
        this.a = addAppLinkActivity;
        this.b = dby;
    }

    public final void onClick(View view) {
        cim a2 = cim.a(this.a);
        dby dby = this.b;
        if (!a2.c.containsKey(dby.k)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("EXTRA_APP_NAME", dby.a);
                jSONObject.put("EXTRA_PACKAGE_NAME", dby.b);
                jSONObject.put("EXTRA_BANNER_URI", dby.c);
                jSONObject.put("EXTRA_DATA_URI", dby.d);
                jSONObject.put("EXTRA_DEVELOPER", dby.g);
                jSONObject.put("EXTRA_CATEGORY", dby.h);
                jSONObject.put("EXTRA_DESCRIPTION", dby.i);
                jSONObject.put("EXTRA_IS_GAME", dby.e);
                jSONObject.put("EXTRA_SCREENSHOTS", new JSONArray((Collection) dby.a()));
                a2.b.edit().putString(dby.k, jSONObject.toString()).apply();
                a2.c.put(dby.k, dby);
                a2.a.i(dby.k);
            } catch (JSONException e) {
                Log.e("AppLinksDataManager", "Fail to convert the app promotion into JSON", e);
            }
        }
        cfs cfs = new cfs(39);
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
        dmi.a = i | 4;
        dmi.d = true;
        if (this.b.d != null) {
            dja h2 = cfs.h();
            String str2 = this.b.d;
            if (h2.b) {
                h2.b();
                h2.b = false;
            }
            dmi dmi3 = (dmi) h2.a;
            str2.getClass();
            dmi3.a |= 2;
            dmi3.c = str2;
        }
        this.a.a.a(cfs);
        this.a.setResult(-1);
        this.a.finish();
    }
}
