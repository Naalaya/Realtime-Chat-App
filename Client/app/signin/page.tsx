import Image from 'next/image';

export default function SignIn() {
  return (
    <div className="flex h-screen items-center justify-center">
      <div className="flex w-1/2 h-3/5 shadow-lg rounded-lg overflow-hidden">
        <div className="w-2/5 bg-gray-100 flex items-center justify-center">
          <Image
            src= "/assets/placeholder-image.png"
            alt="Logo" 
            width={125}
            height={125}
            className="object-contain"
          />
        </div>

        <div className="w-3/5 flex items-center p-3 justify-center bg-[#d9d9d9]">
          <div className="w-[450px] p-4">
            <h2 className="text-2xl font-bold mb-4 text-center text-black">
              Sign In
            </h2>

            <div className="space-y-4">
              <div>
                <label className="block text-base font-semi text-black mb-1">
                  Email
                </label>
                <input
                  type="email"
                  placeholder="Nhập email của bạn"
                  className="w-full px-4 py-2 border-2 border-black border-solid rounded-md focus:outline-none  focus:border-gray-400 text-sm"
                />
              </div>

              <div>
                <label className="block text-base font-semi text-black mb-1">
                  Password
                </label>
                <input
                  type="password"
                  placeholder="Nhập mật khẩu"
                  className="w-full px-4 py-2 border-2 border-black border-solid rounded-md focus:outline-none focus:border-gray-400 text-sm"
                />
              </div>

              <div className="text-left">
                <a href="#" className="text-sm text-black hover:text-gray-700">
                  Forgot your password?
                </a>
              </div>

              <button
                type="submit"
                className="w-full py-2 bg-black hover:bg-gray-800 text-white font-medium rounded-md transition duration-200"
              >
                Sign In
              </button>
            </div>

            <p className="mt-4 text-sm text-left text-black">
              Don&apos;t have an account?{' '}
              <a href="#" className="text-black hover:text-gray-800 font-medium">
                Sign up now
              </a>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}