package p000;

import android.util.Log;
import android.view.View;
import com.google.android.tvlauncher.appsview.AddAppLinkActivity;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cgi */
/* compiled from: PG */
public final class cgi implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ AddAppLinkActivity f5465a;

    /* renamed from: b */
    private final /* synthetic */ dby f5466b;

    public cgi(AddAppLinkActivity addAppLinkActivity, dby dby) {
        this.f5465a = addAppLinkActivity;
        this.f5466b = dby;
    }

    public final void onClick(View view) {
        cim a = cim.m4816a(this.f5465a);
        dby dby = this.f5466b;
        if (!a.f5650c.containsKey(dby.f8193k)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("EXTRA_APP_NAME", dby.f8183a);
                jSONObject.put("EXTRA_PACKAGE_NAME", dby.f8184b);
                jSONObject.put("EXTRA_BANNER_URI", dby.f8185c);
                jSONObject.put("EXTRA_DATA_URI", dby.f8186d);
                jSONObject.put("EXTRA_DEVELOPER", dby.f8189g);
                jSONObject.put("EXTRA_CATEGORY", dby.f8190h);
                jSONObject.put("EXTRA_DESCRIPTION", dby.f8191i);
                jSONObject.put("EXTRA_IS_GAME", dby.f8187e);
                jSONObject.put("EXTRA_SCREENSHOTS", new JSONArray((Collection) dby.mo4081a()));
                a.f5649b.edit().putString(dby.f8193k, jSONObject.toString()).apply();
                a.f5650c.put(dby.f8193k, dby);
                a.f5648a.mo2904i(dby.f8193k);
            } catch (JSONException e) {
                Log.e("AppLinksDataManager", "Fail to convert the app promotion into JSON", e);
            }
        }
        cfs cfs = new cfs(39);
        dja h = cfs.mo2735h();
        String str = this.f5466b.f8184b;
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
        dmi.f8828a = i | 4;
        dmi.f8831d = true;
        if (this.f5466b.f8186d != null) {
            dja h2 = cfs.mo2735h();
            String str2 = this.f5466b.f8186d;
            if (h2.f8673b) {
                h2.mo4505b();
                h2.f8673b = false;
            }
            dmi dmi3 = (dmi) h2.f8672a;
            str2.getClass();
            dmi3.f8828a |= 2;
            dmi3.f8830c = str2;
        }
        this.f5465a.f6378a.mo2714a(cfs);
        this.f5465a.setResult(-1);
        this.f5465a.finish();
    }
}
