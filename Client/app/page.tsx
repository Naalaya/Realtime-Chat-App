"use client";
import SignIn from "../app/signin/page";
// import dynamic from 'next/dynamic'

// const ClientRouter = dynamic(() => import('../components/ClientRouter'), {
//   ssr: false,
// })

export default function Home() {
  return <SignIn />
}