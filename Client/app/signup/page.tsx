import Image from 'next/image';

export default function SignUp() {
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
              Sign up
            </h2>

            <div className="space-y-5">
              <div>
                <label className="block text-sm font-semi text-black mb-2">
                  Email
                </label>
                <input
                  type="email"
                  placeholder="abc@gmail.com"
                  className="w-full px-4 py-2 border-2 border-black border-solid rounded-md focus:outline-none focus:border-gray-400 text-sm"
                />
              </div>

              <div>
                <label className="block text-sm font-semi text-black mb-2">
                  Username
                </label>
                <input
                  type="text"
                  placeholder="AnonyDev"
                  className="w-full px-4 py-2 border-2 border-black border-solid rounded-md focus:outline-none focus:border-gray-400 text-sm"
                />
              </div>

              <div>
                <label className="block text-sm font-semi text-black mb-2">
                  Password
                </label>
                <input
                  type="password"
                  placeholder="abc@12345678-ABC"
                  className="w-full px-4 py-2 border-2 border-black border-solid rounded-md focus:outline-none focus:border-gray-400 text-sm"
                />
              </div>

              <button
                type="submit"
                className="w-full py-2 bg-black hover:bg-gray-800 text-white font-medium rounded-md transition duration-200"
              >
                Sign up
              </button>
            </div>

            <p className="mt-4 text-sm text-left text-black">
              Have an account?{' '}
              <a href="#" className="text-black hover:text-gray-800 font-medium">
                Please sign in.
              </a>
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}