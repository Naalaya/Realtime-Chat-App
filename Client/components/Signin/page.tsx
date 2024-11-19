import Image from 'next/image';

export default function SignIn() {
  return (
    <div className="flex h-screen items-center justify-center">
      <div className="flex w-3/4 h-3/4 shadow-lg rounded-lg overflow-hidden">
        <div className="w-1/2 bg-gray-100 flex items-center justify-center">
          <Image
            src="../../../assets/placeholder-image.png"
            alt="Logo" 
            width={250}
            height={250}
            className="object-contain"
          />
        </div>

        <div className="w-1/2 flex items-center justify-center">
          <div className="w-[350px] p-6">
            <h2 className="text-2xl font-medium mb-6">
              Đăng nhập
            </h2>

            <div className="space-y-5">
              <div>
                <label className="block text-sm font-medium text-gray-600 mb-2">
                  Email
                </label>
                <input
                  type="email"
                  placeholder="Nhập email của bạn"
                  className="w-full px-4 py-2.5 border border-gray-200 rounded-md focus:outline-none focus:border-gray-400"
                />
              </div>

              <div>
                <label className="block text-sm font-medium text-gray-600 mb-2">
                  Mật khẩu
                </label>
                <input
                  type="password"
                  placeholder="Nhập mật khẩu"
                  className="w-full px-4 py-2.5 border border-gray-200 rounded-md focus:outline-none focus:border-gray-400"
                />
              </div>

              <div className="text-left">
                <a href="#" className="text-sm text-gray-500 hover:text-gray-700">
                  Quên mật khẩu?
                </a>
              </div>

              <button
                type="submit"
                className="w-full py-2.5 bg-black hover:bg-gray-800 text-white font-medium rounded-md transition duration-200"
              >
                Đăng nhập
              </button>
            </div>

            <p className="mt-6 text-sm text-left text-gray-500">
              Chưa có tài khoản?{' '}
              <a href="#" className="text-gray-800 hover:text-black font-medium">
                Đăng ký ngay
              </a>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}