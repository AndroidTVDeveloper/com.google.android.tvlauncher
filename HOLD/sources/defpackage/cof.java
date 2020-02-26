package defpackage;

import android.net.Uri;
import android.util.Size;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: cof  reason: default package */
/* compiled from: PG */
public final class cof {
    public final Uri a;

    public cof(coh coh) {
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder path = builder.scheme("https").authority("pubads.g.doubleclick.net").path("/gampad/ads");
        String a2 = a(coh.d, '|');
        if (a2 != null) {
            Uri.Builder appendQueryParameter = path.appendQueryParameter("sz", a2);
            String a3 = a(coh.e, ',');
            if (a3 != null) {
                String str = "1";
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("ciu_szs", a3).appendQueryParameter("iu", coh.a).appendQueryParameter("impl", "s").appendQueryParameter("gdfp_req", str).appendQueryParameter("env", "vp").appendQueryParameter("output", "vast").appendQueryParameter("unviewed_position_start", str).appendQueryParameter("url", coh.b).appendQueryParameter("description_url", coh.c).appendQueryParameter("correlator", coh.f);
                Map map = coh.g;
                StringBuilder sb = new StringBuilder();
                Iterator it = map.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append((String) entry.getValue());
                    while (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        sb.append("&");
                        sb.append((String) entry2.getKey());
                        sb.append("=");
                        sb.append((String) entry2.getValue());
                    }
                }
                appendQueryParameter2.appendQueryParameter("cust_params", sb.toString());
                bmn bmn = coh.h;
                if (bmn != null) {
                    builder.appendQueryParameter("idtype", "adid").appendQueryParameter("rdid", bmn.a).appendQueryParameter("is_lat", !bmn.b ? "0" : str);
                }
                this.a = builder.build();
                return;
            }
            throw new IllegalArgumentException("Ad companion sizes cannot be empty");
        }
        throw new IllegalArgumentException("Ad Unit sizes cannot be empty");
    }

    private static String a(Set set, char c) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Size size = (Size) it.next();
        sb.append(size.getWidth());
        sb.append('x');
        sb.append(size.getHeight());
        while (it.hasNext()) {
            Size size2 = (Size) it.next();
            sb.append(c);
            sb.append(size2.getWidth());
            sb.append('x');
            sb.append(size2.getHeight());
        }
        return sb.toString();
    }
}
