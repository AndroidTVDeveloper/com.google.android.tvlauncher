package defpackage;

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

/* renamed from: cvf  reason: default package */
/* compiled from: PG */
public final class cvf implements cvl {
    public static final Uri a = Uri.parse("content://tvlauncher.inputs/inputs");
    public static final UriMatcher b;
    public static cvf c = null;
    public final List d = new ArrayList(2);
    public List e = Collections.emptyList();
    public boolean f;
    private final Context g;
    private AsyncTask h;
    private boolean i;
    private final cvd j = new cva(this);
    private final ContentObserver k = new cvb(this, new Handler());

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        b = uriMatcher;
        uriMatcher.addURI("tvlauncher.inputs", "inputs", 1);
        b.addURI("tvlauncher.inputs", "inputs/*", 2);
    }

    public final int d(int i2) {
        return 1000;
    }

    public final Drawable g(int i2) {
        return null;
    }

    public cvf(Context context) {
        this.g = context;
    }

    public final void k(int i2) {
        cvh cvh = (cvh) this.e.get(i2);
    }

    public final String j(int i2) {
        return ((cvh) this.e.get(i2)).l;
    }

    public final Uri h(int i2) {
        return ((cvh) this.e.get(i2)).h;
    }

    public final String b(int i2) {
        return ((cvh) this.e.get(i2)).b;
    }

    public final int c(int i2) {
        return ((cvh) this.e.get(i2)).c;
    }

    public final int d() {
        return this.e.size();
    }

    public final String e(int i2) {
        return ((cvh) this.e.get(i2)).e;
    }

    public final String f(int i2) {
        return ((cvh) this.e.get(i2)).m;
    }

    public final void l(int i2) {
        cvh cvh = (cvh) this.e.get(i2);
    }

    public final Uri i(int i2) {
        return ((cvh) this.e.get(i2)).i;
    }

    public final void a(int i2) {
        cvh cvh = (cvh) this.e.get(i2);
        if (cvh.c != 2 || !dck.a(this.g).c()) {
            try {
                this.g.startActivity(cvh.g);
            } catch (Throwable th) {
                Log.e("CustomInputsManager", "Could not perform launch:", th);
                Toast.makeText(this.g, (int) R.string.failed_launch, 0).show();
            }
        } else {
            String f2 = dck.a(this.g).f();
            if (!TextUtils.isEmpty(f2)) {
                Toast.makeText(this.g, f2, 0).show();
            }
        }
    }

    public final void b() {
        a();
    }

    public final void c() {
        if (!this.f) {
            a();
        }
    }

    static Intent a(String str, String str2) {
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
        } catch (URISyntaxException e2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 67 + str2.length());
            sb3.append("parseIntentUri: Cannot parse input intent URI\nInput ID=");
            sb3.append(str);
            sb3.append("\nIntent Uri=");
            sb3.append(str2);
            Log.e("CustomInputsManager", sb3.toString());
            return null;
        }
    }

    public final void a() {
        AsyncTask asyncTask = this.h;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.h = new cve(this.g, this.j).execute(new Void[0]);
    }

    public final void a(cvw cvw) {
        if (!this.d.contains(cvw)) {
            this.d.add(cvw);
            if (this.d.size() == 1) {
                this.i = true;
                this.g.getContentResolver().registerContentObserver(a, true, this.k);
            }
        }
    }

    public final void b(cvw cvw) {
        this.d.remove(cvw);
        if (this.i && this.d.isEmpty()) {
            this.g.getContentResolver().unregisterContentObserver(this.k);
            this.i = false;
        }
    }
}
