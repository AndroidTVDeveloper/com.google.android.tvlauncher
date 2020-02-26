package p000;

import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.google.android.tvlauncher.R;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: cvf */
/* compiled from: PG */
public final class cvf implements cvl {

    /* renamed from: a */
    public static final Uri f7623a = Uri.parse("content://tvlauncher.inputs/inputs");

    /* renamed from: b */
    public static final UriMatcher f7624b;

    /* renamed from: c */
    public static cvf f7625c = null;

    /* renamed from: d */
    public final List f7626d = new ArrayList(2);

    /* renamed from: e */
    public List f7627e = Collections.emptyList();

    /* renamed from: f */
    public boolean f7628f;

    /* renamed from: g */
    private final Context f7629g;

    /* renamed from: h */
    private AsyncTask f7630h;

    /* renamed from: i */
    private boolean f7631i;

    /* renamed from: j */
    private final cvd f7632j = new cva(this);

    /* renamed from: k */
    private final ContentObserver f7633k = new cvb(this, new Handler());

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f7624b = uriMatcher;
        uriMatcher.addURI("tvlauncher.inputs", "inputs", 1);
        f7624b.addURI("tvlauncher.inputs", "inputs/*", 2);
    }

    /* renamed from: d */
    public final int mo3811d(int i) {
        return 1000;
    }

    /* renamed from: g */
    public final Drawable mo3814g(int i) {
        return null;
    }

    public cvf(Context context) {
        this.f7629g = context;
    }

    /* renamed from: k */
    public final void mo3818k(int i) {
        cvh cvh = (cvh) this.f7627e.get(i);
    }

    /* renamed from: j */
    public final String mo3817j(int i) {
        return ((cvh) this.f7627e.get(i)).f7656l;
    }

    /* renamed from: h */
    public final Uri mo3815h(int i) {
        return ((cvh) this.f7627e.get(i)).f7652h;
    }

    /* renamed from: b */
    public final String mo3805b(int i) {
        return ((cvh) this.f7627e.get(i)).f7646b;
    }

    /* renamed from: c */
    public final int mo3808c(int i) {
        return ((cvh) this.f7627e.get(i)).f7647c;
    }

    /* renamed from: d */
    public final int mo3810d() {
        return this.f7627e.size();
    }

    /* renamed from: e */
    public final String mo3812e(int i) {
        return ((cvh) this.f7627e.get(i)).f7649e;
    }

    /* renamed from: f */
    public final String mo3813f(int i) {
        return ((cvh) this.f7627e.get(i)).f7657m;
    }

    /* renamed from: l */
    public final void mo3819l(int i) {
        cvh cvh = (cvh) this.f7627e.get(i);
    }

    /* renamed from: i */
    public final Uri mo3816i(int i) {
        return ((cvh) this.f7627e.get(i)).f7653i;
    }

    /* renamed from: a */
    public final void mo3803a(int i) {
        cvh cvh = (cvh) this.f7627e.get(i);
        if (cvh.f7647c != 2 || !dck.m6123a(this.f7629g).mo4096c()) {
            try {
                this.f7629g.startActivity(cvh.f7651g);
            } catch (Throwable th) {
                Log.e("CustomInputsManager", "Could not perform launch:", th);
                Toast.makeText(this.f7629g, (int) R.string.failed_launch, 0).show();
            }
        } else {
            String f = dck.m6123a(this.f7629g).mo4099f();
            if (!TextUtils.isEmpty(f)) {
                Toast.makeText(this.f7629g, f, 0).show();
            }
        }
    }

    /* renamed from: b */
    public final void mo3806b() {
        mo3802a();
    }

    /* renamed from: c */
    public final void mo3809c() {
        if (!this.f7628f) {
            mo3802a();
        }
    }

    /* renamed from: a */
    static Intent m5710a(String str, String str2) {
        if (str2 == null) {
            String valueOf = String.valueOf(str);
            Log.e("CustomInputsManager", valueOf.length() == 0 ? new String("parseIntentUri: intent URI can't be null\nInput ID=") : "parseIntentUri: intent URI can't be null\nInput ID=".concat(valueOf));
            return null;
        }
        Uri parse = Uri.parse(str2);
        if (!"intent".equals(parse.getScheme())) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 89 + str2.length());
            sb.append("parseIntentUri: have to use Intent.URI_INTENT_SCHEME for intent URI\nInput ID=");
            sb.append(str);
            sb.append("\nIntent Uri=");
            sb.append(str2);
            Log.e("CustomInputsManager", sb.toString());
            return null;
        }
        try {
            Intent parseUri = Intent.parseUri(str2, 1);
            if ("android.media.tv".equals(parse.getAuthority()) || parseUri.getComponent() != null) {
                parseUri.addFlags(268435456);
                return parseUri;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 93 + str2.length());
            sb2.append("parseIntentUri: Custom input intent URI should contain a component name\nInput ID=");
            sb2.append(str);
            sb2.append("\nIntent Uri=");
            sb2.append(str2);
            Log.e("CustomInputsManager", sb2.toString());
            return null;
        } catch (URISyntaxException e) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 67 + str2.length());
            sb3.append("parseIntentUri: Cannot parse input intent URI\nInput ID=");
            sb3.append(str);
            sb3.append("\nIntent Uri=");
            sb3.append(str2);
            Log.e("CustomInputsManager", sb3.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final void mo3802a() {
        AsyncTask asyncTask = this.f7630h;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f7630h = new cve(this.f7629g, this.f7632j).execute(new Void[0]);
    }

    /* renamed from: a */
    public final void mo3804a(cvw cvw) {
        if (!this.f7626d.contains(cvw)) {
            this.f7626d.add(cvw);
            if (this.f7626d.size() == 1) {
                this.f7631i = true;
                this.f7629g.getContentResolver().registerContentObserver(f7623a, true, this.f7633k);
            }
        }
    }

    /* renamed from: b */
    public final void mo3807b(cvw cvw) {
        this.f7626d.remove(cvw);
        if (this.f7631i && this.f7626d.isEmpty()) {
            this.f7629g.getContentResolver().unregisterContentObserver(this.f7633k);
            this.f7631i = false;
        }
    }
}
