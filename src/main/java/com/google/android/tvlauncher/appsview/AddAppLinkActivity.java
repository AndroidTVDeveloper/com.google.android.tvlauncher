package com.google.android.tvlauncher.appsview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.tvlauncher.R;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class AddAppLinkActivity extends cfu {

    /* renamed from: a */
    public cfp f6378a;

    /* renamed from: c */
    public ImageView f6379c;

    /* renamed from: d */
    public int f6380d;

    /* renamed from: e */
    private LinearLayout f6381e;

    /* renamed from: f */
    private ImageView f6382f;

    /* renamed from: g */
    private TextView f6383g;

    /* renamed from: h */
    private TextView f6384h;

    /* renamed from: i */
    private TextView f6385i;

    /* renamed from: j */
    private TextView f6386j;

    /* renamed from: k */
    private Button f6387k;

    /* renamed from: l */
    private Button f6388l;

    /* renamed from: m */
    private Button f6389m;

    /* renamed from: n */
    private agj f6390n;

    public AddAppLinkActivity() {
        super("AddAppLinkActivity");
    }

    /* renamed from: a */
    public final void mo3217a() {
        setResult(0);
        finish();
    }

    /* renamed from: a */
    private static final boolean m5251a(Intent intent, String str) {
        return intent.hasExtra(str) && !TextUtils.isEmpty(intent.getStringExtra(str));
    }

    public final void onBackPressed() {
        mo3217a();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6378a = this.f5439b;
        setContentView((int) R.layout.add_applink_dialog);
        this.f6381e = (LinearLayout) findViewById(R.id.dialog_view);
        this.f6382f = (ImageView) findViewById(R.id.app_icon);
        this.f6379c = (ImageView) findViewById(R.id.app_screenshot);
        this.f6383g = (TextView) findViewById(R.id.app_title);
        this.f6384h = (TextView) findViewById(R.id.app_developer);
        this.f6385i = (TextView) findViewById(R.id.app_description);
        this.f6386j = (TextView) findViewById(R.id.app_category);
        this.f6387k = (Button) findViewById(R.id.open_button);
        this.f6388l = (Button) findViewById(R.id.allow_button);
        this.f6389m = (Button) findViewById(R.id.deny_button);
        this.f6380d = getResources().getDimensionPixelSize(R.dimen.applink_dialog_image_rounded_corner_radius);
        ColorDrawable colorDrawable = new ColorDrawable(C0035bg.m3116b(this, R.color.app_banner_background_color));
        this.f6390n = new agj((byte) 0).mo195a(colorDrawable).mo205c(colorDrawable).mo199a(C0594vy.f10649a).mo198a((C0544ub) new dae(getColor(R.color.app_banner_background_color), true));
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.format = -1;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        m5250a(getIntent());
    }

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        m5250a(intent);
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.m6187a((Activity) this);
    }

    /* renamed from: a */
    private final void m5250a(Intent intent) {
        String callingPackage = getCallingPackage();
        if (callingPackage == null || !dcy.m6192a(this, callingPackage) || !m5251a(intent, "EXTRA_APP_NAME") || !m5251a(intent, "EXTRA_PACKAGE_NAME") || !m5251a(intent, "EXTRA_BANNER_URI") || !m5251a(intent, "EXTRA_DATA_URI") || !m5251a(intent, "EXTRA_DEVELOPER") || !m5251a(intent, "EXTRA_CATEGORY") || !m5251a(intent, "EXTRA_DESCRIPTION") || !intent.hasExtra("EXTRA_IS_GAME")) {
            Log.e("AddAppLinkActivity", String.format("The metadata for installing the app link is invalid. App name: %s, Package name: %s, Banner uri: %s, Data uri: %s, Developer: %s , Category: %s, Description: %s, has IsGame extra: %s", intent.getStringExtra("EXTRA_APP_NAME"), intent.getStringExtra("EXTRA_PACKAGE_NAME"), intent.getStringExtra("EXTRA_BANNER_URI"), intent.getStringExtra("EXTRA_DATA_URI"), intent.getStringExtra("EXTRA_DEVELOPER"), intent.getStringExtra("EXTRA_CATEGORY"), intent.getStringExtra("EXTRA_DESCRIPTION"), Boolean.valueOf(intent.hasExtra("EXTRA_IS_GAME"))));
            mo3217a();
            return;
        }
        dbx dbx = new dbx((byte) 0);
        dbx.f8173a = intent.getStringExtra("EXTRA_APP_NAME");
        dbx.f8174b = intent.getStringExtra("EXTRA_PACKAGE_NAME");
        dbx.f8175c = intent.getStringExtra("EXTRA_BANNER_URI");
        dbx.f8176d = intent.getStringExtra("EXTRA_DATA_URI");
        dbx.f8177e = intent.getStringExtra("EXTRA_DEVELOPER");
        dbx.f8178f = intent.getStringExtra("EXTRA_CATEGORY");
        dbx.f8179g = intent.getStringExtra("EXTRA_DESCRIPTION");
        dbx.f8180h = intent.getBooleanExtra("EXTRA_IS_GAME", false);
        dbx.f8181i = true;
        dby a = dbx.mo4080a();
        if (cim.m4816a(this).mo2862a(a.f8193k) != null) {
            Log.e("AddAppLinkActivity", "The app link is already installed");
            mo3217a();
            return;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("EXTRA_SCREENSHOTS");
        if (stringArrayExtra != null && stringArrayExtra.length > 0) {
            a.f8192j.addAll(Arrays.asList(stringArrayExtra));
        }
        if (!isFinishing() && !isDestroyed()) {
            this.f6387k.setOnClickListener(new cgh(this, a));
            this.f6388l.setText((int) R.string.add);
            this.f6388l.setOnClickListener(new cgi(this, a));
            this.f6389m.setOnClickListener(new cgj(this, a));
            Spanned fromHtml = Html.fromHtml(getResources().getString(R.string.app_category, TextUtils.htmlEncode(a.f8190h)), 0);
            this.f6383g.setText(a.f8183a);
            this.f6384h.setText(a.f8189g);
            this.f6385i.setText(a.f8191i);
            this.f6386j.setText(fromHtml);
            this.f6381e.setVisibility(0);
            this.f6387k.requestFocus();
            cgk cgk = new cgk(this);
            this.f6382f.setOutlineProvider(cgk);
            this.f6382f.setClipToOutline(true);
            C0497si.m8292a((Activity) this).mo5945a(a.f8185c).mo202b(this.f6390n).mo5938a(this.f6382f);
            List a2 = a.mo4081a();
            if (!a2.isEmpty()) {
                this.f6379c.setOutlineProvider(cgk);
                this.f6379c.setClipToOutline(true);
                C0497si.m8292a((Activity) this).mo5945a((String) a2.get(0)).mo5937a((ahg) new cgl(this));
                return;
            }
            return;
        }
        Log.e("AddAppLinkActivity", "Activity is no longer running");
    }
}
