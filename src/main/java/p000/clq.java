package p000;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: clq */
/* compiled from: PG */
final class clq implements clx {

    /* renamed from: a */
    private final String f5923a;

    public clq(String str) {
        this.f5923a = str;
    }

    /* renamed from: a */
    public final HttpURLConnection mo3102a(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestProperty("User-Agent", this.f5923a);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setInstanceFollowRedirects(false);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200 || responseCode == 302) {
            return httpURLConnection;
        }
        String valueOf = String.valueOf(str);
        throw new clt(valueOf.length() == 0 ? new String("Error http status when connecting to DoubleClick for server Url: ") : "Error http status when connecting to DoubleClick for server Url: ".concat(valueOf), responseCode);
    }
}
