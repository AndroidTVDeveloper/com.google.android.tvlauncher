package p000;

import android.net.Uri;
import android.util.Size;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: cof */
/* compiled from: PG */
public final class cof {

    /* renamed from: a */
    public final Uri f6143a;

    public cof(coh coh) {
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder path = builder.scheme("https").authority("pubads.g.doubleclick.net").path("/gampad/ads");
        String a = m5205a(coh.f6155d, '|');
        if (a != null) {
            Uri.Builder appendQueryParameter = path.appendQueryParameter("sz", a);
            String a2 = m5205a(coh.f6156e, ',');
            if (a2 != null) {
                String str = "1";
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("ciu_szs", a2).appendQueryParameter("iu", coh.f6152a).appendQueryParameter("impl", "s").appendQueryParameter("gdfp_req", str).appendQueryParameter("env", "vp").appendQueryParameter("output", "vast").appendQueryParameter("unviewed_position_start", str).appendQueryParameter("url", coh.f6153b).appendQueryParameter("description_url", coh.f6154c).appendQueryParameter("correlator", coh.f6157f);
                Map map = coh.f6158g;
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
                bmn bmn = coh.f6159h;
                if (bmn != null) {
                    builder.appendQueryParameter("idtype", "adid").appendQueryParameter("rdid", bmn.f4416a).appendQueryParameter("is_lat", !bmn.f4417b ? "0" : str);
                }
                this.f6143a = builder.build();
                return;
            }
            throw new IllegalArgumentException("Ad companion sizes cannot be empty");
        }
        throw new IllegalArgumentException("Ad Unit sizes cannot be empty");
    }

    /* renamed from: a */
    private static String m5205a(Set set, char c) {
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
